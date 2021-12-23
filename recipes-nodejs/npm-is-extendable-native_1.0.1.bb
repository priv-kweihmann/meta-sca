SUMMARY = "NPM: is-extendable"
DESCRIPTION = "Returns true if a value is a plain object, array or function."
HOMEPAGE = "https://github.com/jonschlinkert/is-extendable"

DEPENDS = "npm-is-plain-object-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78c705080a639d3bb4085a9d1bb22987"

SRC_URI = "https://registry.npmjs.org/is-extendable/-/is-extendable-1.0.1.tgz"
SRC_URI[md5sum] = "61392549d95a063512f916897d7069b7"
SRC_URI[sha256sum] = "42ebd9d5d0cafcb3ce0bef5f579d0ada4233772386e4f9078169e3d232082658"

NPM_PKGNAME = "is-extendable"

inherit npmhelper
inherit native
