SUMMARY = "NPM: e-prime"
DESCRIPTION = "detect various forms of 'to be' inside of sentences"
HOMEPAGE = "https://github.com/Vorror/e-prime#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=111fd89a01cf7b4537c42811bc3f6ed0"

SRC_URI = "https://registry.npmjs.org/e-prime/-/e-prime-0.10.3.tgz"
SRC_URI[md5sum] = "b888a95c0939838da4504ce4e5e09f18"
SRC_URI[sha256sum] = "756af7049d57dbe26018c859be99b249dfa787defb9ad12264218228382deb6f"

NPM_PKGNAME = "e-prime"

python do_unpack_append() {
    import os
    os.rename(d.expand("${S}/ LICENSE"), d.expand("${S}/LICENSE"))
}

inherit npmhelper
inherit native
