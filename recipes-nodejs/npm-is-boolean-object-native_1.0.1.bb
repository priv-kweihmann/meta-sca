SUMMARY = "NPM: is-boolean-object"
DESCRIPTION = "Is this value a JS Boolean? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/ljharb/is-boolean-object#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-boolean-object/-/is-boolean-object-1.0.1.tgz"
SRC_URI[md5sum] = "10e83d55f0e9de11919b626225bdd3d6"
SRC_URI[sha256sum] = "2d608d7e7c6dac5a5f398a553075dcb1c73a8990ca7a95eb16cb8b563d1a3ba0"

NPM_PKGNAME = "is-boolean-object"

inherit npmhelper
inherit native
