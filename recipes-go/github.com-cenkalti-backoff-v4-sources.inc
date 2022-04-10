SRC_URI += "https://proxy.golang.org/github.com/cenkalti/backoff/v4/@v/v4.1.3.zip;srcoutput=github.com/cenkalti/backoff/v4;srcinput=github.com/cenkalti/backoff/v4@v4.1.3;downloadfilename=github-com-cenkalti-backoff-v4-4.1.3.zip;name=github-com-cenkalti-backoff-v4"
SRC_URI[github-com-cenkalti-backoff-v4.sha256sum] = "73ff572a901c0307aa1c16db43812da7ca2555aa403cfdd9d3a239ecbdad2274"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/cenkalti/backoff/v4/LICENSE;md5=1571d94433e3f3aa05267efd4dbea68b \
"

GOSRC_INCLUDEGUARD += "github.com-cenkalti-backoff-v4-sources.inc"

