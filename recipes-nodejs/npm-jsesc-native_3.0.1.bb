SUMMARY = "NPM: jsesc"
DESCRIPTION = "Given some data, jsesc returns the shortest possible stringified & ASCII-safe representation of that data."
HOMEPAGE = "https://mths.be/jsesc"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/jsesc/-/jsesc-3.0.1.tgz"
SRC_URI[md5sum] = "1e8a9bb08bb749bf60d02e9be0027846"
SRC_URI[sha256sum] = "47859be0cba13c9c9a9fe451ef109bc95633d69f72211a7923a528272671ecc3"

NPM_PKGNAME = "jsesc"

inherit npmhelper
inherit native
