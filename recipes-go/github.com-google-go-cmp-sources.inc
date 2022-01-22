SRC_URI += "https://proxy.golang.org/github.com/google/go-cmp/@v/v0.5.7.zip;srcoutput=github.com/google/go-cmp;srcinput=github.com/google/go-cmp@v0.5.7;downloadfilename=github-com-google-go-cmp-0.5.7.zip;name=github-com-google-go-cmp"
SRC_URI[github-com-google-go-cmp.sha256sum] = "6c739327d027b2e6573ae5fe3de501ad1e3691af6a9e7f34541944010f142f27"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/google/go-cmp/LICENSE;md5=4ac66f7dea41d8d116cb7fb28aeff2ab \
"

GOSRC_INCLUDEGUARD += "github.com-google-go-cmp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-xerrors-sources.inc', '', 'golang.org-x-xerrors-sources.inc', d)}
