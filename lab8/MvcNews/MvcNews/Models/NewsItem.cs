﻿using System;
using System.ComponentModel.DataAnnotations;

namespace MvcNews.Models
{
    public class NewsItem
    {
        public int Id { get; set; }

        [DataType(DataType.Date)]
        [DisplayFormat(DataFormatString = "{0:MM/dd/yyyy}")]
        public DateTime TimeStamp { get; set; }

        [Required]
        [StringLength(140, MinimumLength = 5)]
        public string Text { get; set; }


        [Timestamp]
        public byte[] RowVersion { get; set; }
    }
}
