SUMMARY = "RubyGem: aws-sdk-eks"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Kubernetes Service (Amazon EKS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "763c52445e1e0221de9bcd10b6db157a"
SRC_URI[sha256sum] = "d6ab1655541d3f3960882af8e773294420d8fbd1b2c813be0e31bdab0b8f6419"

GEM_NAME = "aws-sdk-eks"

inherit rubygems
