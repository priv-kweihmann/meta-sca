SRC_URI_append = " https://proxy.golang.org/github.com/mwitkow/go-conntrack/@v/v0.0.0-20190716064945-2f068394615f.zip;srcoutput=github.com/mwitkow/go-conntrack;srcinput=github.com/mwitkow/go-conntrack@v0.0.0-20190716064945-2f068394615f;downloadfilename=github-com-mwitkow-go-conntrack-0.0.0-20190716064945-2f068394615f.zip;name=github-com-mwitkow-go-conntrack"
SRC_URI[github-com-mwitkow-go-conntrack.sha256sum] = "d6fc513490d5c73e3f64ede3cf18ba973a4f8ef4c39c9816cc6080e39c8c480a"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/mwitkow/go-conntrack/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
"
