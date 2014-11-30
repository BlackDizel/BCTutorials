using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Navigation;
using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;
using System.Diagnostics;

namespace HT2Page
{
    public class MyData
    {
        public string text { get { return _text; } set { _text = value; } }
        public string text2 { get; set; }
        private string _text;
    }
    public partial class TwoPage : PhoneApplicationPage
    {
        MyData[] data;
        public TwoPage()
        {
            InitializeComponent();
            data = new MyData[]
            {
                new MyData(){text="one",text2="this one"},
                new MyData(){text="two",text2="this two"},
                new MyData(){text="three",text2="this three"}
            };

            lb.ItemsSource=data;
            Debug.WriteLine("start");
        }
    }
}