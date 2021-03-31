SRC_URI_append = " https://proxy.golang.org/github.com/beorn7/perks/@v/v1.0.1.zip;srcoutput=github.com/beorn7/perks;srcinput=github.com/beorn7/perks@v1.0.1;downloadfilename=github-com-beorn7-perks-1.0.1.zip;name=github-com-beorn7-perks"
SRC_URI[github-com-beorn7-perks.sha256sum] = "25bd9e2d94aca770e6dbc1f53725f84f6af4432f631d35dd2c46f96ef0512f1a"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/beorn7/perks/LICENSE;md5=0d0738f37ee8dc0b5f88a32e83c60198 \
"
