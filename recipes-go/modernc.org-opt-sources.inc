SRC_URI += "https://proxy.golang.org/modernc.org/opt/@v/v0.1.3.zip;srcoutput=modernc.org/opt;srcinput=modernc.org/opt@v0.1.3;downloadfilename=modernc-org-opt-0.1.3.zip;name=modernc-org-opt"
SRC_URI[modernc-org-opt.sha256sum] = "294b1b80137cb86292c8893481d545eee90b17b84b6ad1dcb2e6c9bb523a2d9e"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/modernc.org/opt/LICENSE;md5=fb8eb6f21a83684c821d24d0e0a07cc3 \
"

GOSRC_INCLUDEGUARD += "modernc.org-opt-sources.inc"

