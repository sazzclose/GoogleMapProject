package com.example.googleMapProject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.googleMapProject.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera


        val uok = LatLng(6.9744,79.9161)
        val uom = LatLng(6.7951,79.9009)
        val uoc =LatLng(6.9000,79.8588)

        val uojpura =LatLng(6.8508,79.9059)
        val uoe=LatLng(7.7944,81.5790)
        val uoj = LatLng(9.6849,80.0220)
        val uop = LatLng(7.2549,80.5974)
        val uorj = LatLng(8.3620,80.5048)
        val uoruhuna = LatLng(5.9381,80.5761)
        val uos = LatLng(6.7146,80.7872)
        val use = LatLng(7.2970,81.8500)
        val uwu = LatLng(6.9819, 81.0763)
        val uow = LatLng(7.3226,79.9882)
        val sydney = LatLng(-34.0,151.0)

        mMap.addMarker(MarkerOptions().position(uok).title("Marker in uok"))
        mMap.addMarker(MarkerOptions().position(uoc).title("Marker in uoc"))
        mMap.addMarker(MarkerOptions().position(uojpura).title("Marker in uojpura"))
        mMap.addMarker(MarkerOptions().position(uoe).title("Marker in uoe"))
        mMap.addMarker(MarkerOptions().position(uoj).title("Marker in uoj"))
        mMap.addMarker(MarkerOptions().position(uos).title("Marker in uos"))
        mMap.addMarker(MarkerOptions().position(uom).title("Marker in uom"))
        mMap.addMarker(MarkerOptions().position(uop).title("Marker in uop"))
        mMap.addMarker(MarkerOptions().position(uorj).title("Marker in uorj"))
        mMap.addMarker(MarkerOptions().position(uoruhuna).title("Marker in uoruhuna"))
        mMap.addMarker(MarkerOptions().position(use).title("Marker in use"))
        mMap.addMarker(MarkerOptions().position(uwu).title("Marker in uwu"))
        mMap.addMarker(MarkerOptions().position(uow).title("Marker in uow"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(uoc))
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in sydney"))
    }
}