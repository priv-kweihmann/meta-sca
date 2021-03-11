SUMMARY = "RubyGem: aws-sdk-efs"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic File System (EFS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "aca5adfb709faa2c40e63297a3238962"
SRC_URI[sha256sum] = "cd5ea4e901bdc542b99ca16f8a3e4cc23b015231cd02e4d8b7a6ceae0dfab74e"

GEM_NAME = "aws-sdk-efs"

inherit rubygems
