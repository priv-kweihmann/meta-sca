SUMMARY = "NPM: fastest-levenshtein"
DESCRIPTION = "Fastest Levenshtein distance implementation in JS."
HOMEPAGE = "https://github.com/ka-weihe/fastest-levenshtein#README"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c1958fb64daa1119cb89d0c859aa49a9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/fastest-levenshtein/-/fastest-levenshtein-1.0.10.tgz"
SRC_URI[md5sum] = "b7ab743d59695fc502b2d591afbd03ea"
SRC_URI[sha256sum] = "194265e08fbf40c3a5dab6ff5ada8d9fde8de67e0ade1662a0c60cb82105c778"

NPM_PKGNAME = "fastest-levenshtein"

inherit npmhelper
inherit native
