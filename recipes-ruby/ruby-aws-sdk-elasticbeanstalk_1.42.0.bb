SUMMARY = "RubyGem: aws-sdk-elasticbeanstalk"
DESCRIPTION = "Official AWS Ruby gem for AWS Elastic Beanstalk (Elastic Beanstalk)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "b9ae4d067598ce0e0c1b1c5b6553bc66"
SRC_URI[sha256sum] = "e23f07446ec5b9e6e836b39805b38a7026d3c361e1c42775365aa5e9a4432e25"

GEM_NAME = "aws-sdk-elasticbeanstalk"

inherit rubygems
