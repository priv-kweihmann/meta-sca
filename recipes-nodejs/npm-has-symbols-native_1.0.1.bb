SUMMARY = "NPM: has-symbols"
DESCRIPTION = "Determine if the JS environment has Symbol support. Supports spec, or shams."
HOMEPAGE = "https://github.com/ljharb/has-symbols#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=afee57a289508ed4df3456667778aaf6"

SRC_URI = "https://registry.npmjs.org/has-symbols/-/has-symbols-1.0.1.tgz"
SRC_URI[md5sum] = "2f7778db84bbcdba2159065de20140a5"
SRC_URI[sha256sum] = "3d0af8ac4a12bcab413fd2505a33cddd8ddef0ae06e123e33a71559163e3d689"

NPM_PKGNAME = "has-symbols"

inherit npmhelper
inherit native
