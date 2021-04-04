SRC_URI += "https://proxy.golang.org/github.com/cenkalti/backoff/@v/v2.2.1+incompatible.zip;srcoutput=github.com/cenkalti/backoff;srcinput=github.com/cenkalti/backoff@v2.2.1+incompatible;downloadfilename=github-com-cenkalti-backoff-2.2.1+incompatible.zip;name=github-com-cenkalti-backoff"
SRC_URI[github-com-cenkalti-backoff.sha256sum] = "f8196815a1b4d25e5b8158029d5264801fc8aa5ff128ccf30752fd169693d43b"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/cenkalti/backoff/LICENSE;md5=1571d94433e3f3aa05267efd4dbea68b \
"

GOSRC_INCLUDEGUARD += "github.com-cenkalti-backoff-sources.inc"

