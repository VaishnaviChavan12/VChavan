(function($) {

// prettyPhoto
	jQuery(document).ready(function(){
		jQuery('a[data-gal]').each(function() {
			jQuery(this).attr('rel', jQuery(this).data('gal'));
		});  	
		jQuery("a[data-rel^='prettyPhoto']").prettyPhoto({animationSpeed:'slow',theme:'light_square',slideshow:false,overlay_gallery: false,social_tools:false,deeplinking:false});
	}); 

		
})(jQuery);

links.forEach(link => {
    link.addEventListener('click', (e) => {
        // Prevent the default behavior of the link (e.g., navigating to a new page)

        // Remove the 'selected-link' class from all links
        links.forEach(link => {
            link.classList.remove('selected-link');
        });

        // Add the 'selected-link' class to the clicked link
        e.target.classList.add('selected-link');
    });
});