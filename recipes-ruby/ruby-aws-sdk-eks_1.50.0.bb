SUMMARY = "RubyGem: aws-sdk-eks"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Kubernetes Service (Amazon EKS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "21467b56922ecebdb2c76621a3fb5631"
SRC_URI[sha256sum] = "2100e10a6026cb4ef67d2bd23bfcc918f8d31e80067e5cd0da559942dda28344"

GEM_NAME = "aws-sdk-eks"

inherit rubygems
