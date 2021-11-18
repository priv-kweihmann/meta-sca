SRC_URI += "https://proxy.golang.org/bitbucket.org/creachadair/shell/@v/v0.0.7.zip;srcoutput=bitbucket.org/creachadair/shell;srcinput=bitbucket.org/creachadair/shell@v0.0.7;downloadfilename=bitbucket-org-creachadair-shell-0.0.7.zip;name=bitbucket-org-creachadair-shell"
SRC_URI[bitbucket-org-creachadair-shell.sha256sum] = "a9ec1467996b8d7611105849d9e4ba25e4befd360a838af1b023e9a55071c9a7"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/bitbucket.org/creachadair/shell/LICENSE;md5=5ab805cea35f8960c320947cb99b2db3 \
"

GOSRC_INCLUDEGUARD += "bitbucket.org-creachadair-shell-sources.inc"

