SUMMARY = "NPM: known-css-properties"
DESCRIPTION = "List of known CSS properties"
HOMEPAGE = "https://github.com/known-css/known-css-properties#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37549544f16ed84cd09a09af0e78977f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/known-css-properties/-/known-css-properties-0.19.0.tgz"
SRC_URI[md5sum] = "26fa1b4c9292a2554bb23b65b55e68fa"
SRC_URI[sha256sum] = "7fc03a99274db42f92c5172b57ae94ebcc66d3d41f26f5257a0d7f312fa5302c"

NPM_PKGNAME = "known-css-properties"

inherit npmhelper
inherit native
