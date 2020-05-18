SUMMARY = "NPM: es6-promisify"
DESCRIPTION = "Converts callback-based functions to ES6 Promises"
HOMEPAGE = "https://github.com/digitaldesignlabs/es6-promisify#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d089316727f79388fc1f57026c8946a9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/es6-promisify/-/es6-promisify-6.1.1.tgz"
SRC_URI[md5sum] = "e092ca93370bd4681b1c6abcd30ec68b"
SRC_URI[sha256sum] = "26323ebce0c25491b48593ef88f52d759a3bc3c8374f63596520e8730e97d094"

NPM_PKGNAME = "es6-promisify"

inherit npmhelper
inherit native
