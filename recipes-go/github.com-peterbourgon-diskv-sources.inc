SRC_URI += "https://proxy.golang.org/github.com/peterbourgon/diskv/@v/v2.0.1+incompatible.zip;srcoutput=github.com/peterbourgon/diskv;srcinput=github.com/peterbourgon/diskv@v2.0.1+incompatible;downloadfilename=github-com-peterbourgon-diskv-2.0.1+incompatible.zip;name=github-com-peterbourgon-diskv"
SRC_URI[github-com-peterbourgon-diskv.sha256sum] = "1eeff260bd1ad71cd1611078995db99e1c7eba28628e7d6f24c79039536ea1cb"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/peterbourgon/diskv/LICENSE;md5=f9f3e815fc84aa04c4f4db33c553eef9 \
"

GOSRC_INCLUDEGUARD += "github.com-peterbourgon-diskv-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-btree-sources.inc', '', 'github.com-google-btree-sources.inc', d)}
