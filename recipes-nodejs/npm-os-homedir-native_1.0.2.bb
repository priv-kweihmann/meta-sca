SUMMARY = "NPM: os-homedir"
DESCRIPTION = "Node.js 4 `os.homedir()` ponyfill"
HOMEPAGE = "https://github.com/sindresorhus/os-homedir#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/os-homedir/-/os-homedir-1.0.2.tgz"
SRC_URI[md5sum] = "00b6f9a1bc0ae6cf61e412122a7f8616"
SRC_URI[sha256sum] = "0ee885c8afec352b70b7b65f7ab8e54a912f8ba4c309ae1c106aa4b67cb24475"

NPM_PKGNAME = "os-homedir"

inherit npmhelper
inherit native
