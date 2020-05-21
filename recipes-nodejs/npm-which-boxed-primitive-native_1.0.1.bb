SUMMARY = "NPM: which-boxed-primitive"
DESCRIPTION = "Which kind of boxed JS primitive is this?"
HOMEPAGE = "https://github.com/ljharb/which-boxed-primitive#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=375dc7ca936a14e9c29418d5263bd066"

DEPENDS = "npm-is-bigint-native \
           npm-is-boolean-object-native \
           npm-is-number-object-native \
           npm-is-string-native \
           npm-is-symbol-native"

SRC_URI = "https://registry.npmjs.org/which-boxed-primitive/-/which-boxed-primitive-1.0.1.tgz"
SRC_URI[md5sum] = "62e23b35e0a1f06ce9c272265185cfe9"
SRC_URI[sha256sum] = "f048747a9459c74db5cb93f7f2017b46bbf78a127e65fb3fc5515ad7f8d6dff1"

NPM_PKGNAME = "which-boxed-primitive"

inherit npmhelper
inherit native
