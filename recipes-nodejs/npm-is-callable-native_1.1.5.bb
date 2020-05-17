SUMMARY = "NPM: is-callable"
DESCRIPTION = "Is this JS value callable? Works with Functions and GeneratorFunctions, despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/ljharb/is-callable#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

SRC_URI = "https://registry.npmjs.org/is-callable/-/is-callable-1.1.5.tgz"
SRC_URI[md5sum] = "5a69abbe4f2e27a9491b9a60c479194f"
SRC_URI[sha256sum] = "0bc4e25e92f5f1b3a22c3def638be8c7968a574a60a1c52eff564f12d4fbfbab"

NPM_PKGNAME = "is-callable"

inherit npmhelper
inherit native
