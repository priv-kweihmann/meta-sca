SRC_URI += "https://proxy.golang.org/github.com/cenkalti/backoff/v4/@v/v4.1.2.zip;srcoutput=github.com/cenkalti/backoff/v4;srcinput=github.com/cenkalti/backoff/v4@v4.1.2;downloadfilename=github-com-cenkalti-backoff-v4-4.1.2.zip;name=github-com-cenkalti-backoff-v4"
SRC_URI[github-com-cenkalti-backoff-v4.sha256sum] = "079f531ecefaf6e9b9dd6600218979d83d9e64d0677553184ba412f10c88f820"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/cenkalti/backoff/v4/LICENSE;md5=1571d94433e3f3aa05267efd4dbea68b \
"

GOSRC_INCLUDEGUARD += "github.com-cenkalti-backoff-v4-sources.inc"

