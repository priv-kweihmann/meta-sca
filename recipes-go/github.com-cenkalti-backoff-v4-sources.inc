SRC_URI += "https://proxy.golang.org/github.com/cenkalti/backoff/v4/@v/v4.1.1.zip;srcoutput=github.com/cenkalti/backoff/v4;srcinput=github.com/cenkalti/backoff/v4@v4.1.1;downloadfilename=github-com-cenkalti-backoff-v4-4.1.1.zip;name=github-com-cenkalti-backoff-v4"
SRC_URI[github-com-cenkalti-backoff-v4.sha256sum] = "de69f5db190ee0f2c441e50e4bf607853ab99512a183a5713803888ced502dde"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/cenkalti/backoff/v4/LICENSE;md5=1571d94433e3f3aa05267efd4dbea68b \
"

GOSRC_INCLUDEGUARD += "github.com-cenkalti-backoff-v4-sources.inc"

