import { Component, OnInit } from '@angular/core';
import { Product } from '../../common/product';
import { ProductService } from '../../services/product.service';

@Component({
  selector: 'app-home',
  imports: [],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit{

  products:Product[] = [];

  constructor(private productService:ProductService){

  }

  ngOnInit(): void {

    this.productService.getProducts().subscribe(
      data => this.products = data
    );
  }



}
