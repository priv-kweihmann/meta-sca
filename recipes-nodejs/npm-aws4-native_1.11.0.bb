SUMMARY = "NPM: aws4"
DESCRIPTION = "Signs and prepares requests using AWS Signature Version 4"
HOMEPAGE = "https://github.com/mhart/aws4#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ff6f181928a91d8631d565516b4db3cb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/aws4/-/aws4-1.11.0.tgz"
SRC_URI[md5sum] = "3d5814f8881b536b2c741a419ae703f6"
SRC_URI[sha256sum] = "cd4a8c31fb669e3365b4ae4fe136333bf1612e74f7d57cd953698eee79682fa9"

NPM_PKGNAME = "aws4"

inherit npmhelper
inherit native
