SUMMARY = "NPM: jsesc"
DESCRIPTION = "Given some data, jsesc returns the shortest possible stringified & ASCII-safe representation of that data."
HOMEPAGE = "https://mths.be/jsesc"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/jsesc/-/jsesc-3.0.2.tgz"
SRC_URI[md5sum] = "d239880e291f8f2f2a4e470a294b6ef3"
SRC_URI[sha256sum] = "17be8ba196d533040e9ab9cc11da3dff60a2e7a7cf98ae5c3a45b20ca7efefcc"

NPM_PKGNAME = "jsesc"

inherit npmhelper
inherit native
