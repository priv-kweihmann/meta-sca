SUMMARY = "RubyGem: aws-sdk-elasticbeanstalk"
DESCRIPTION = "Official AWS Ruby gem for AWS Elastic Beanstalk (Elastic Beanstalk)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "3d04b3110fddb5f898a9e9c5bff9295a"
SRC_URI[sha256sum] = "d43cd239200caf790112c5f447c746f47587861ef12fc7bd9ab9cdc0495044be"

GEM_NAME = "aws-sdk-elasticbeanstalk"

inherit rubygems
