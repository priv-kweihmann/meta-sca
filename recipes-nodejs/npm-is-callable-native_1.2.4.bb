SUMMARY = "NPM: is-callable"
DESCRIPTION = "Is this JS value callable? Works with Functions and GeneratorFunctions, despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-callable#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-callable/-/is-callable-1.2.4.tgz"
SRC_URI[md5sum] = "c34435f9cd64c1bbc3f762a7ec3bc6b0"
SRC_URI[sha256sum] = "789483e71bc10b4bc9d5013885d7e4ca6b986bb39356edddb9ef987cd151f3e5"

NPM_PKGNAME = "is-callable"

inherit npmhelper
inherit native
