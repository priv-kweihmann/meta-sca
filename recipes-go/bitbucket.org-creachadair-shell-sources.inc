SRC_URI += "https://proxy.golang.org/bitbucket.org/creachadair/shell/@v/v0.0.6.zip;srcoutput=bitbucket.org/creachadair/shell;srcinput=bitbucket.org/creachadair/shell@v0.0.6;downloadfilename=bitbucket-org-creachadair-shell-0.0.6.zip;name=bitbucket-org-creachadair-shell"
SRC_URI[bitbucket-org-creachadair-shell.sha256sum] = "8be90d87643ef5fb8a437bed24529f06e5791869ccf89dde652c0dec58b1f62d"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/bitbucket.org/creachadair/shell/LICENSE;md5=5ab805cea35f8960c320947cb99b2db3 \
"

GOSRC_INCLUDEGUARD += "bitbucket.org-creachadair-shell-sources.inc"

