SUMMARY = "NPM: is-callable"
DESCRIPTION = "Is this JS value callable? Works with Functions and GeneratorFunctions, despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/ljharb/is-callable#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-callable/-/is-callable-1.2.3.tgz"
SRC_URI[md5sum] = "b75cc4e62764fffc9c6821d1b03f2b69"
SRC_URI[sha256sum] = "cb23948f1ff759c5c2ccb28ffb6a3dddf00135313adae015c9adbef09bded4fd"

NPM_PKGNAME = "is-callable"

inherit npmhelper
inherit native
