SUMMARY = "NPM: is-plain-object"
DESCRIPTION = "Returns true if an object was created by the `Object` constructor, or Object.create(null)."
HOMEPAGE = "https://github.com/jonschlinkert/is-plain-object"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3d83ea4c8ec9b31d9ff2c82fa29beabb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-plain-object/-/is-plain-object-5.0.0.tgz"
SRC_URI[md5sum] = "048600ce79f188cbf513a2c10811c336"
SRC_URI[sha256sum] = "405ffdac90b988722906f2c25e627331c8ac952201c5e2eefab1c61f22d25bd3"

NPM_PKGNAME = "is-plain-object"

inherit npmhelper
inherit native
