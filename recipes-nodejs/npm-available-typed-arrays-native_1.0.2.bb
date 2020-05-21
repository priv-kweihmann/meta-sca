SUMMARY = "NPM: available-typed-arrays"
DESCRIPTION = "Returns an array of Typed Array names that are available in the current environment"
HOMEPAGE = "https://github.com/inspect-js/available-typed-arrays#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838b75dc6028daf3e04e57871b7ad3ed"

DEPENDS = "npm-array-filter-native"

SRC_URI = "https://registry.npmjs.org/available-typed-arrays/-/available-typed-arrays-1.0.2.tgz"
SRC_URI[md5sum] = "7469b74ee55dd7fc4a9364232014c922"
SRC_URI[sha256sum] = "f6c0730193534b8641c1d54cccc378c00ab761086a1ee435b21ef1a48ee7491a"

NPM_PKGNAME = "available-typed-arrays"

inherit npmhelper
inherit native
