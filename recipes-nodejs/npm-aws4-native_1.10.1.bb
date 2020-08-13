SUMMARY = "NPM: aws4"
DESCRIPTION = "Signs and prepares requests using AWS Signature Version 4"
HOMEPAGE = "https://github.com/mhart/aws4#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ff6f181928a91d8631d565516b4db3cb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/aws4/-/aws4-1.10.1.tgz"
SRC_URI[md5sum] = "f080e0add75ed2571726233bad469d6b"
SRC_URI[sha256sum] = "0bc2224ea933ba1552a75c6e7bc0c4f51e447881608af6af65255900901cd749"

NPM_PKGNAME = "aws4"

inherit npmhelper
inherit native
