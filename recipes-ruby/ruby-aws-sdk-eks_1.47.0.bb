SUMMARY = "RubyGem: aws-sdk-eks"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Kubernetes Service (Amazon EKS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "65f95a9995b2ae4caea655435cbfc020"
SRC_URI[sha256sum] = "640fe041b88eea8f8298367aa34525586e565353e0146d6030f61c449731465a"

GEM_NAME = "aws-sdk-eks"

inherit rubygems
