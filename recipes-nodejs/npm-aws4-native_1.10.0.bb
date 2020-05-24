SUMMARY = "NPM: aws4"
DESCRIPTION = "Signs and prepares requests using AWS Signature Version 4"
HOMEPAGE = "https://github.com/mhart/aws4#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ff6f181928a91d8631d565516b4db3cb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/aws4/-/aws4-1.10.0.tgz"
SRC_URI[md5sum] = "b2449337ea0cd04f695f88f2323365d8"
SRC_URI[sha256sum] = "c68d781e6c40ef0c21fa3dd3a392e6ce6bebeb2d0b9124e0ac13558fd7999996"

NPM_PKGNAME = "aws4"

inherit npmhelper
inherit native
