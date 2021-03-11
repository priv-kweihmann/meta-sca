SUMMARY = "RubyGem: aws-sdk-configservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Config (Config Service)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "84d50e58d6213a90752ab9de0df5ca20"
SRC_URI[sha256sum] = "696ebd5607dd751591aaa9b5afd5588c9b938c530f355afb21c4bf8dcb76a83a"

GEM_NAME = "aws-sdk-configservice"

inherit rubygems
