SUMMARY = "NPM: number-is-nan"
DESCRIPTION = "ES2015 Number.isNaN() ponyfill"
HOMEPAGE = "https://github.com/sindresorhus/number-is-nan#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/number-is-nan/-/number-is-nan-1.0.1.tgz"
SRC_URI[md5sum] = "1c192095065e6b72a7e20a747b110469"
SRC_URI[sha256sum] = "896ec5dd2269a0f219b0e46dd24b5532cdfd1648f1e5156078854b912d619f3c"

NPM_PKGNAME = "number-is-nan"

inherit npmhelper
inherit native
