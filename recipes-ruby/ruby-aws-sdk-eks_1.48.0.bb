SUMMARY = "RubyGem: aws-sdk-eks"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Kubernetes Service (Amazon EKS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "ac5aee6ed418fb1446288e2dcec2245f"
SRC_URI[sha256sum] = "e41791c6c9bb272ecbb2f4affd3b0d3edd5667244eb51a03680c07ea1e02ec9f"

GEM_NAME = "aws-sdk-eks"

inherit rubygems
