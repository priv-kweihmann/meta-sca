SUMMARY = "NPM: cspell-dict-filetypes"
DESCRIPTION = "Filetypes dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/filetypes#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-filetypes/-/cspell-dict-filetypes-1.2.3.tgz"
SRC_URI[md5sum] = "9a30f404fd2d9e94e6d137bd928051dc"
SRC_URI[sha256sum] = "a7ae5fa796ed8d666f256983ce8caf2f27a92077851033443ef4c829ef1e3d43"

NPM_PKGNAME = "cspell-dict-filetypes"

inherit npmhelper
inherit native
