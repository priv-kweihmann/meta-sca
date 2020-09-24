SUMMARY = "NPM: is-callable"
DESCRIPTION = "Is this JS value callable? Works with Functions and GeneratorFunctions, despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/ljharb/is-callable#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-callable/-/is-callable-1.2.2.tgz"
SRC_URI[md5sum] = "b1315e511a12435a1dd7be282c70b97c"
SRC_URI[sha256sum] = "dbeb1a661c20d74b6381e85195e6502328fcc7018d28638300ea844d626815c8"

NPM_PKGNAME = "is-callable"

inherit npmhelper
inherit native
