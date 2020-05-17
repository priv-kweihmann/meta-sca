SUMMARY = "NPM: es6-promisify"
DESCRIPTION = "Converts callback-based functions to ES6 Promises"
HOMEPAGE = "https://github.com/digitaldesignlabs/es6-promisify#readme"

DEPENDS = "npm-es6-promise-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=89;md5=e91eb70253228afc134134539c5240e5"

SRC_URI = "https://registry.npmjs.org/es6-promisify/-/es6-promisify-5.0.0.tgz"
SRC_URI[md5sum] = "ec2f85c2b5121ebe4e1dd13982212004"
SRC_URI[sha256sum] = "6ccd965ee102cfbf11422a76ecdeb1e6e6070d9bfa3b9172d08bb1e02d9907dd"

NPM_PKGNAME = "es6-promisify"

inherit npmhelper
inherit native
