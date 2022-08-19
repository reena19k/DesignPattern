package com.aurionpro.model;

	public class HatAdaptor implements IItem {
		private Hat hat;
		
		public HatAdaptor(Hat hat) {
			super();
			this.hat = hat;
		}
		
		@Override
		public String getName() {
			return hat.getLongName();
		}

		@Override
		public double getPrice() {
			return hat.getBasePrice()+ (hat.getBasePrice()*hat.getGst());
		}

	}


