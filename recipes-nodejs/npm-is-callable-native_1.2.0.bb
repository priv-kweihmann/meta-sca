SUMMARY = "NPM: is-callable"
DESCRIPTION = "Is this JS value callable? Works with Functions and GeneratorFunctions, despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/ljharb/is-callable#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-callable/-/is-callable-1.2.0.tgz"
SRC_URI[md5sum] = "bac9f7a745be8f8266a99a67e055204c"
SRC_URI[sha256sum] = "a6c4a0594c97b75bd74b5ae1422ed631ebb2b857a473aa0bf91cd69f759facab"

NPM_PKGNAME = "is-callable"

inherit npmhelper
inherit native
