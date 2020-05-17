SUMMARY = "NPM: p-memoize"
DESCRIPTION = "Memoize promise-returning & async functions"
HOMEPAGE = "https://github.com/sindresorhus/p-memoize#readme"

DEPENDS = "npm-mem-native npm-mimic-fn-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/p-memoize/-/p-memoize-3.1.0.tgz"
SRC_URI[md5sum] = "d1086e5de665ba1f52d325dffeb269d2"
SRC_URI[sha256sum] = "21f3a57be25b8ecf4bb962c19db57483988398a8291fb4ec68253adfc3227543"

NPM_PKGNAME = "p-memoize"

inherit npmhelper
inherit native
