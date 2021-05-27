SRC_URI += "https://proxy.golang.org/github.com/google/go-cmp/@v/v0.5.6.zip;srcoutput=github.com/google/go-cmp;srcinput=github.com/google/go-cmp@v0.5.6;downloadfilename=github-com-google-go-cmp-0.5.6.zip;name=github-com-google-go-cmp"
SRC_URI[github-com-google-go-cmp.sha256sum] = "32c6bb53a2f214fecd43ca0a436758488d088a9ac23e391ef4b502eda0591147"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/google/go-cmp/LICENSE;md5=4ac66f7dea41d8d116cb7fb28aeff2ab \
"

GOSRC_INCLUDEGUARD += "github.com-google-go-cmp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-xerrors-sources.inc', '', 'golang.org-x-xerrors-sources.inc', d)}
