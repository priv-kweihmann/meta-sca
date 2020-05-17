SUMMARY = "NPM: aws4"
DESCRIPTION = "Signs and prepares requests using AWS Signature Version 4"
HOMEPAGE = "https://github.com/mhart/aws4#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ff6f181928a91d8631d565516b4db3cb"

SRC_URI = "https://registry.npmjs.org/aws4/-/aws4-1.9.1.tgz"
SRC_URI[md5sum] = "24a1d383f4b15489f03a8534c82d37b2"
SRC_URI[sha256sum] = "756ab13d29ff64184aaf21ae0d1d393fa6f85a3500f27d98dd2892507e71eb18"

S = "${WORKDIR}/package"

NPM_PKGNAME = "aws4"

inherit npmhelper
inherit native
