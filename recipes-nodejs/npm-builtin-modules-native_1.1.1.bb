SUMMARY = "NPM: builtin-modules"
DESCRIPTION = "List of the Node.js builtin modules"
HOMEPAGE = "https://github.com/sindresorhus/builtin-modules#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/builtin-modules/-/builtin-modules-1.1.1.tgz"
SRC_URI[md5sum] = "31e45d747577630f57118c9360e1e8ea"
SRC_URI[sha256sum] = "e789717824e8688269c241c203d9f615cf15286d6217d74defc7f395b0da5f11"

NPM_PKGNAME = "builtin-modules"

inherit npmhelper
inherit native
