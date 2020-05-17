SUMMARY = "NPM: array-includes"
DESCRIPTION = "An ES7/ES2016 spec-compliant `Array.prototype.includes` shim/polyfill/replacement that works as far down as ES3."
HOMEPAGE = "https://github.com/es-shims/array-includes#readme"

DEPENDS = "npm-define-properties-native npm-es-abstract-native npm-is-string-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b"

SRC_URI = "https://registry.npmjs.org/array-includes/-/array-includes-3.1.1.tgz"
SRC_URI[md5sum] = "c9d126b0268c4dbe88a57818992ae906"
SRC_URI[sha256sum] = "a7656507680a4634ab359b70f380ddfdd5f2ba3182a2300ecaedf6ec2dab3216"

NPM_PKGNAME = "array-includes"

inherit npmhelper
inherit native
